public class highest_occurence_Of_character {
	public static void main(String[] args) {
		String n="malayalam";
		int count;
		int nh=0;
		char ch=0;
		int arr[]=new int[n.length()];
		for(int i=0;i<n.length();i++) {
			count=1;
			for(int j=i+1;j<n.length();j++) {
				if(n.charAt(i)==n.charAt(j)) {
					count++;
					arr[j]=-1;
				}
			}
			if(arr[i]!=-1) {
				arr[i]=count;
			}
		}
		for(int i=0;i<n.length();i++) {
			int max=arr[0];
			if(arr[i]>max){
				ch=n.charAt(i);
				nh=arr[i];
			}
            // if(arr[i]!=-1)
			// 	System.out.println(n.charAt(i)+" "+arr[i]);
	}
	System.out.println(ch+" "+nh);
	}
}