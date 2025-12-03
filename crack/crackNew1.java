int base =10;
Function<Integer,Integer> f = x => x + base;
// base = 20; // line commented

System.out.prinln(f.apply(5));
