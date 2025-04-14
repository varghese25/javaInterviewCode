const [text, setText] = useState("hello");
useEffect(() => {
  setText(prev => prev.toUpperCase());
  setText("world");
}, []);
console.log(text);
