/**
 *
 * @author aji sudarmawan
 * file name : testEmployee.java
 */

class Person{
    private String firtsName;
    private String lastName;
    private String birthDate;
    
    public String getFirtsName(){
        return firtsName;
    }
    
    public void setFirstName(String firtsName){
        this.firtsName = firtsName;
    }
    
    public String getLastName(){
        return lastName;
    }
    
    public  void setLastName(String lastName){
        this.lastName = lastName;
    }
    
    public String getBirthDate(){
        return birthDate;
    }
    
    public void setBirthDate(String birthDate){
        this.birthDate = birthDate;
    }

}

class Employee extends Person{
    private String status;
    private String jobTitle;
    private String startDate;
    private String department;
    
    public String getStatus(){
        return status;
    }
    
    public void setStatus(String status){
        this.status = status;
    }
    
    public String getJobTitle(){
        return jobTitle;
    }
    
    public void setJobTitle(String jobTitle){
        this.jobTitle = jobTitle;
    }
    
    public String getStartDate(){
        return startDate;
    }
    
    public void setStartDate(String startDate){
        this.startDate = startDate;
    }
    
    public String getDepartment(){
        return department;
    }
    
    public void setDepartment(String department){
        this.department = department;
    }
}

public class testEmployee {
    public static void main(String[] args){
        //membuat objek karyawan
        Employee karyawan = new Employee();
        //Setter
        karyawan.setFirstName("Sal");
        karyawan.setLastName("an");
        karyawan.setBirthDate("20 july 1991");
        karyawan.setJobTitle("front office");
        karyawan.setStatus("tetap");
        karyawan.setDepartment("Pemasaran");
        
        //getter
        System.out.println("Nama Karyawan : "+ karyawan.getFirtsName() + " "+karyawan.getLastName());
        System.out.println("Tanggal Lahir : "+ karyawan.getBirthDate());
        System.out.println("Bagian : " + karyawan.getJobTitle());
        System.out.println("Status : "+ karyawan.getStatus());
        System.out.println("Departemen : "+ karyawan.getDepartment());
    }
}
