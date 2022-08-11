package Training;
public class WifiPin {
            public static void main(String[] args) {
                int roomNo=777;
                String lastName="vijay";
                System.out.println("RoomNo is:"+roomNo);
                System.out.println("LastName:"+lastName);
                createWifiPin(roomNo,lastName);
            }
            public static void createWifiPin(int roomNo, String lastName) {
                char[] wifi=new char[4];
                int unitRoom=roomNo%10;
                int TensRoom=(roomNo%100)/10;
                int sum=findFirstValue(roomNo);
                //System.out.println(sum);
                wifi[3]=(char)(TensRoom+'0');
                wifi[2]=lastName.charAt(lastName.length()-1);
                wifi[1]=findingSymbol(unitRoom);
                wifi[0]=(char)(sum+'0');

                String wifi1=new String(wifi);
                System.out.println("Wifi Pin:"+wifi1);
            }
            static char findingSymbol(int unitRoom) {
                char symbol[]= {')','!','@','#','$','%','^','&','*','(',};
                char specialSymbol='\0';
                for(int i=0;i<symbol.length;i++) {
                    if(i==unitRoom) {
                        specialSymbol=symbol[i];
                    }
                }
                return specialSymbol;
            }
            static int findFirstValue(int roomNo) {

                int sum = 0;
                while (roomNo != 0) {
                    int d = roomNo % 10;
                    sum += d;
                    roomNo = roomNo / 10;
                    if (roomNo == 0 && sum > 10) {
                        roomNo = sum;
                        sum = 0;
                    }
                }
                if (sum % 2 != 0) {
                    sum=sum-1;
                    return sum;
                }
                if(sum==1){
                    return 2;
                }
                else {
                    return sum;
                }
            }
        }