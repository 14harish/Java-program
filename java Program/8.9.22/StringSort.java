public class StringSort {
    public static void main(String[] args) {
        String n[]={"Harish","Ajai","Abishake","Arun","Deepak"};
        int compare=0;
        String temp="";
        for(int i=0;i<n.length;i++){
            for(int j=i+1;j<n.length;j++){
                compare=n[i].compareTo(n[j]);
                if(0<compare){
                    temp=n[j];
                    n[j]=n[i];
                    n[i]=temp;
                }
               // System.out.println(compare);
            }
        }
        for(int i=0;i<n.length;i++){
            System.out.println(n[i]);
        }
    }
}
