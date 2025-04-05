<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0" />
  <title>AI Java Debugger</title>
  <style>
    body {
      font-family: Arial, sans-serif;
      background: #1e1e1e;
      color: #fff;
      padding: 20px;
    }
    h2 { color: #00d8ff; }
    input[type="file"] {
      margin-bottom: 10px;
    }
    textarea {
      width: 100%;
      height: 200px;
      background: #2b2b2b;
      color: #fff;
      border: none;
      padding: 10px;
      margin-bottom: 10px;
      font-family: monospace;
    }
    pre {
      background: #2b2b2b;
      padding: 10px;
      overflow-x: auto;
      white-space: pre-wrap;
    }
    button {
      background-color: #00d8ff;
      color: #000;
      padding: 10px 20px;
      border: none;
      border-radius: 5px;
      margin: 5px;
      cursor: pointer;
    }
  </style>
</head>
<body>
  <h2>AI Java Debugging Tool</h2>
  <input type="file" id="javaFile" accept=".java" />
  <button onclick="analyzeCode()">Analyze</button>
  <button onclick="autoFixCode()">Auto Fix</button>
  <button onclick="simulateOutput()">Simulate Output</button>
  <button onclick="clearAll()">Clear</button>

  <h3>Original Code:</h3>
  <textarea id="originalCode" readonly></textarea>

  <h3>Detected Errors:</h3>
  <pre id="errorLog"></pre>

  <h3>AI Fixed Code:</h3>
  <textarea id="fixedCode"></textarea>

  <h3>Simulated Output:</h3>
  <pre id="output"></pre>

  <script>
    let original = '';

    function analyzeCode() {
      const file = document.getElementById('javaFile').files[0];
      if (!file) return alert("Upload a Java file");

      const reader = new FileReader();
      reader.onload = e => {
        original = e.target.result;
        document.getElementById('originalCode').value = original;

        const errors = [];
        const lines = original.split('\n');

        lines.forEach((line, index) => {
          if (line.includes('Math.min(') && !line.includes(',')) {
            errors.push(`[Line ${index + 1}] Math.min() requires two arguments.`);
          }
          if (line.includes('System.ot.println')) {
            errors.push(`[Line ${index + 1}] Typo: Did you mean System.out.println()?`);
          }
          if (line.trim().startsWith('System.out.println') && !line.trim().endsWith(';')) {
            errors.push(`[Line ${index + 1}] Missing semicolon at end.`);
          }
          if (line.includes('{') && !line.includes('}')) {
            errors.push(`[Line ${index + 1}] Possible unmatched braces.`);
          }
        });

        if (errors.length === 0) {
          errors.push('[INFO] No known syntax errors detected.');
        }

        document.getElementById('errorLog').textContent = errors.join('\n');
      };

      reader.readAsText(file);
    }

    function autoFixCode() {
      let code = original;
      code = code.replace('Math.min(10)', 'Math.min(10, 20)');
      code = code.replace('System.ot.println', 'System.out.println');
      code = code.replace(/(System\.out\.println\(.*?)([^;\n])$/, '$1;$2');
      document.getElementById('fixedCode').value = code;
    }

    function simulateOutput() {
      const code = document.getElementById('fixedCode').value;
      let output = '[SIMULATED OUTPUT]\n';

      if (code.includes('Math.min(10, 20)')) {
        output += '10';
      } else {
        output += 'Output simulation not available for this code.';
      }

      document.getElementById('output').textContent = output;
    }

    function clearAll() {
      document.getElementById('javaFile').value = '';
      document.getElementById('originalCode').value = '';
      document.getElementById('errorLog').textContent = '';
      document.getElementById('fixedCode').value = '';
      document.getElementById('output').textContent = '';
    }
  </script>
</body>
</html>
