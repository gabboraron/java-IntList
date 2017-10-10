class IntList{
	
	//VÁLTOZÓK
	int list [] = new int[0];
	int i = 0;
	
	//KONSTRUKTOROK
	public IntList() {
		i = 0;
	}
	
	public IntList(String[] elems) {
		list = new int[elems.length];
		i = 0;
		for (String j : elems){
			list[i] = Integer.parseInt(j);
			++i;
		}
	}
	
	public static void main(String[] args){
		IntList(args);
	}
	
	/*
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
	*/
}