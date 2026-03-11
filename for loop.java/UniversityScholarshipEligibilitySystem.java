import java.util.Scanner;
public class UniversityScholarshipEligibilitySystem {
    public static void main(String[] args) {
        Scanner object=new Scanner(System.in);
        Double gpa=object.nextDouble();
        Double familyincome=object.nextDouble();
        int extracurricalarscore=object.nextInt();
        String scholarshiptype=object.next();

        if(gpa>=2.5){
            if(scholarshiptype.equals("merit")){
                if(gpa>=3.8 && extracurricalarscore>=80){
                    System.out.println("GPA:"+gpa);
                    System.out.println("Family Income:"+familyincome);
                    System.out.println("Extracurricular Score:"+extracurricalarscore);
                    System.out.println("Scholarship Type:"+scholarshiptype);
                    System.out.println("Eligibility:Eligible");
                    System.out.println("Award Amount:$25000");
                    System.out.println("Award Category:Full");
                }
                else if(gpa>=3.5 && extracurricalarscore>=70){
                    System.out.println("GPA:"+gpa);
                    System.out.println("Family Income:"+familyincome);
                    System.out.println("Extracurricular Score:"+extracurricalarscore);
                    System.out.println("Scholarship Type:"+scholarshiptype);
                    System.out.println("Eligibility:Eligible");
                    System.out.println("Award Amount:$15000");
                    System.out.println("Award Category:Partial");
                }
                else if(gpa>=3.0 && extracurricalarscore>=60){
                    System.out.println("GPA:"+gpa);
                    System.out.println("Family Income:"+familyincome);
                    System.out.println("Extracurricular Score:"+extracurricalarscore);
                    System.out.println("Scholarship Type:"+scholarshiptype);
                    System.out.println("Eligibility:Eligible");
                    System.out.println("Award Amount:$8000");
                    System.out.println("Award Category:Minimal");
                }
                else{
                    System.out.println("GPA:"+gpa);
                    System.out.println("Family Income:"+familyincome);
                    System.out.println("Extracurricular Score:"+extracurricalarscore);
                    System.out.println("Scholarship Type:"+scholarshiptype);
                    System.out.println("Eligibility:Not Eligible");
                    System.out.println("Award Amount:$0.0");
                    System.out.println("Award Category:None");
                }
            }
            else if(scholarshiptype.equals("need-based")){
                if(gpa>=3.5 && familyincome<=30000){
                    System.out.println("GPA:"+gpa);
                    System.out.println("Family Income:"+familyincome);
                    System.out.println("Extracurricular Score:"+extracurricalarscore);
                    System.out.println("Scholarship Type:"+scholarshiptype);
                    System.out.println("Eligibility:Eligible");
                    System.out.println("Award Amount:$30000");
                    System.out.println("Award Category:Full");
                }
                else if(gpa>=3.0 && familyincome<=50000){
                    System.out.println("GPA:"+gpa);
                    System.out.println("Family Income:"+familyincome);
                    System.out.println("Extracurricular Score:"+extracurricalarscore);
                    System.out.println("Scholarship Type:"+scholarshiptype);
                    System.out.println("Eligibility:Eligible");
                    System.out.println("Award Amount:$18000");
                    System.out.println("Award Category:Partial");
                }
                else if(gpa>=2.8 && familyincome<=70000){
                    System.out.println("GPA:"+gpa);
                    System.out.println("Family Income:"+familyincome);
                    System.out.println("Extracurricular Score:"+extracurricalarscore);
                    System.out.println("Scholarship Type:"+scholarshiptype);
                    System.out.println("Eligibility:Eligible");
                    System.out.println("Award Amount:$10000");
                    System.out.println("Award Category:Minimal");
                }
                else{
                    System.out.println("GPA:"+gpa);
                    System.out.println("Family Income:"+familyincome);
                    System.out.println("Extracurricular Score:"+extracurricalarscore);
                    System.out.println("Scholarship Type:"+scholarshiptype);
                    System.out.println("Eligibility:Not Eligible");
                    System.out.println("Award Amount:$0.0");
                    System.out.println("Award Category:None");
                }
            }
            else if(scholarshiptype.equals("sports")){
                if(gpa>=3.0 && extracurricalarscore>=85){
                    System.out.println("GPA:"+gpa);
                    System.out.println("Family Income:"+familyincome);
                    System.out.println("Extracurricular Score:"+extracurricalarscore);
                    System.out.println("Scholarship Type:"+scholarshiptype);
                    System.out.println("Eligibility:Eligible");
                    System.out.println("Award Amount:$22000");
                    System.out.println("Award Category:Full");
                }
                else if(gpa>=2.8 && extracurricalarscore>=75){
                    System.out.println("GPA:"+gpa);
                    System.out.println("Family Income:"+familyincome);
                    System.out.println("Extracurricular Score:"+extracurricalarscore);
                    System.out.println("Scholarship Type:"+scholarshiptype);
                    System.out.println("Eligibility:Eligible");
                    System.out.println("Award Amount:$20000");
                    System.out.println("Award Category:MPartial");
                }
                else if(gpa>=2.5 && extracurricalarscore>=65){
                    System.out.println("GPA:"+gpa);
                    System.out.println("Family Income:"+familyincome);
                    System.out.println("Extracurricular Score:"+extracurricalarscore);
                    System.out.println("Scholarship Type:"+scholarshiptype);
                    System.out.println("Eligibility:Eligible");
                    System.out.println("Award Amount:$12000");
                    System.out.println("Award Category:Minimal");
                }
                else{
                    System.out.println("GPA:"+gpa);
                    System.out.println("Family Income:"+familyincome);
                    System.out.println("Extracurricular Score:"+extracurricalarscore);
                    System.out.println("Scholarship Type:"+scholarshiptype);
                    System.out.println("Eligibility:Not Eligible");
                    System.out.println("Award Amount:$0.0");
                    System.out.println("Award Category:None");
                }
            }
        }
        else{
            System.out.println("GPA:"+gpa);
            System.out.println("Family Income:"+familyincome);
            System.out.println("Extracurricular Score:"+extracurricalarscore);
            System.out.println("Scholarship Type:"+scholarshiptype);
            System.out.println("Eligibility:Not Eligible");
            System.out.println("Award Amount:$0.0");
            System.out.println("Award Category:None");
        }
    }
}
