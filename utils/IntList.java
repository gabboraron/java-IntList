class IntList{
	public static void main(String[] args){
		/*if(args.length == 0){
			int l [] = new int[0];
			int i = 0;
		}else{
			int l [] = new int[args.length];
			int i = 0;
			for (String s : args){
				l[i] = Integer.parseInt(s);
				++i;
			}
		}
		
		addInd(l, 3, 4);
		for(int i : l){
			System.out.printl(i);
		}*/
	}
	//KONSTANSOK
	
	//KONSTRUKTOROK
	public IntList() {}
	public IntList(int[] elems) {}
	
	public static int[] add(int[] l, int a){
		l[l.length+1] = a;
		return l;
	}
	
	public static int[] addInd(int[] l, int a, int ind){
		int j = 0;
		boolean ok = false;
		int tmp = 0;
		
		for(int i : l){
			if(ok == false){
				if(j == ind){
					ok = true;
					tmp = i;
					l[j] = a;
				}
				++j;
			}else{
				l[j] = tmp;
				tmp = i;
				++j;
			}
		}
		l[j] = tmp;
		
		return (l);
	}
	
}