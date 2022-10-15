package tenprogram;

public class encryption {
public static void main(String[] args) {
	int last=0;
	String n="EngIneering";
	String s="abcdefghijklmnopqrstuvwxyz";
	String c="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	int[] index=new int[n.length()];
	//System.out.println(n.length());
	char small[]=s.toCharArray();
	char caps[]=c.toCharArray();
	char name[]=n.toCharArray();
	//System.out.println(caps[13]);
	for(int i=0;i<name.length;i++) {
		for(int j=0;j<small.length;j++) {
		if(name[i]==small[j]) {
			int k=j+1;
			index[i]=k;
			//System.out.println(name[i]+""+small[i]);
			//System.out.println(name[i]+"="+k);
		}
		if(name[i]==caps[j]) {
			int k=j+1;
			index[i]=k;
			//System.out.println(name[i]+""+small[i]);
			//System.out.println(name[i]+"="+k);
		}
	}
}
	 last=index[index.length-1];
      /*for(int p=0;p<name.length;p++) {
		System.out.println(name[p]+"="+index[p]);   
	   }*/
	 encrypt(index,name,small,caps,last);
}
static void encrypt(int index[],char name[],char small[],char caps[],int last) {
	int[] add=new int[index.length];
	 char Cs = 64, Cl = 91, cs = 96, cl = 123;
	for(int i=0;i<add.length;i++) {
		if(i==index.length-1){
			add[i]=index[i];
		}
		else {
		add[i]=index[i]-last;
		}
	}
	for(int i=0;i<add.length;i++) {
		if(add[i]<=0) {
			add[i]=add[i]+26;
		}
	}
    /*  for(int i=0;i<add.length;i++) {
		System.out.println(name[i]+"="+index[i]+"="+add[i]);	
		}*/
for(int i=0;i<name.length;i++) {
	for(int j=0;j<small.length;j++) {
	if(name[i]>cs&&name[i]<cl) {
		if(add[i]==j+1) {
		System.out.print(small[j]);
		//System.out.println(name[i]+""+small[i]);
		//System.out.println(name[i]+"="+k);
	}
	}
	 if(name[i]>Cs&&name[i]<Cl) {
			if(add[i]==j+1) {
			System.out.print(caps[j]);
			//System.out.println(name[i]+""+small[i]);
			//System.out.println(name[i]+"="+k);
		}
	}
}
}
}
}
