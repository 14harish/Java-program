class patient{
    String Name;
    double weight;
    double height;
    patient(String Name,double weight,double height){
        this.Name=Name;
        this.weight=weight;
        this.height=height;
    }
    public double IBM(){
        return (weight/(height*height));
    }
}
class patients{
    patient[] pc=new patient[10];
    patients(){
    pc[0]=new patient("Arun",44,1.2);
    pc[1]=new patient("HarishR",55,1.2);
    pc[2]=new patient("viswanth",70,1.7);
    pc[3]=new patient("divakaran uncle",77.76,1.2);
    pc[4]=new patient("guru",66,1.2);
    pc[5]=new patient("deepak",44,1.7);
    pc[6]=new patient("veera",84,1.5);
    pc[7]=new patient("bhavan",44,1.0);
    pc[8]=new patient("hariharan",47,1.2);
    pc[9]=new patient("barath",54,1.8);
}
public void find(){
    System.out.println("--------------High IBM------------------:");
    for(int i=0;i<10;i++){
        if(pc[i].IBM()>25){
            System.out.print(pc[i].Name+":"+pc[i].IBM()+"\n");
        }
    }
    System.out.println("--------------LOW IBM---------------------:");
    for(int i=0;i<10;i++){
        if(pc[i].IBM()<25){
            System.out.print(pc[i].Name+":"+pc[i].IBM()+"\n");
        }
    }
    System.out.println("--------------NORMAL IBM---------------------:");
    for(int i=0;i<10;i++){
        if(pc[i].IBM()==25){
            System.out.print(pc[i].Name+":"+pc[i].IBM()+"\n");
        }
    }
}
}
public class health_care_professional_to_keep_track_patient_vital_statistics {
    public static void main(String[] args) {
    patients p=new patients();
    p.find();
    }
}
