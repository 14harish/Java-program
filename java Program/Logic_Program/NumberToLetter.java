
public class NumberToLetter {
    public static void main(String[] args) {
        int n=2323;
        String s=String.valueOf(n);
        char d[]=s.toCharArray();
        System.out.println(NumberToWord(d));
    }
    public static StringBuffer NumberToWord(char[] n){
        StringBuffer sc=new StringBuffer();
        String one[]={"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
        String Tens[]={"Ten","Eleven","Twelve","Thirten","Fourtien","Fivftien","Sixten","Seventen","Eighten","Nineten"};
        String TensWithZero[]={"","","Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninety"};
        String powers[]={"Hundred","Thousand"};
        int len=n.length;
        if(len==1){
            sc.append(one[n[0]-1]);
        }
            int x=0;
            while(x<n.length){
               if(len==5){
                if(n[x]-'0'!=0){
                    sc.append(TensWithZero[n[x]-'0']);
                    sc.append(one[n[x]-'0']+" ");
                    sc.append(powers[1]+" ");
                }
                len=len-2;
                x=x+2;
               }
               if(len==3 || len==4){
                    if(n[x]-'0'!=0){
                    sc.append(one[(n[x]-'0')]+" ");
                    sc.append(powers[len-3]+" ");
                    }
                    len--;
                        sc.append("And"+" ");
                }
                else{
                    if(n[x]-'0'==1){
                        int sum=n[x]-'0'+n[x+1]-'0';
                        sc.append(Tens[sum-1]);
                        break;
                    }
                    else if(n[x]-'0'==2 && n[x+1]-'0'==0 ){
                        sc.append("Twenty");
                        break;
                    }
                    else{
                        int i=n[x]-'0';
                        if(i>0){
                            sc.append(TensWithZero[i]);
                            // len--;
                        if(n[x+1]==0){
                            sc.append(one[n[0]]);
                        }
                        else{
                            sc.append(one[n[x+1]-'0']);
                        }
                    }
                    break;
                    }
                }
                ++x;
            }
        return sc;
    }
    }

