package products;
final public class Software extends Product {

    private String programmer;
    private String platform; // linux, mac, or pc
    private String os;

    public Software(){

    }
    public Software(String code, String description, double price, String os, String programmer){
        super(code, description, price);
        this.os = os;
        this.programmer = programmer;
    }

    public String toString() {
        return
                "Code:               " + this.code + "\n" +
                "Description:        " + this.description + "\n" +
                "Price:              " + this.getFormattedPrice() + "\n" +
                "OS:                 " + this.os + "\n" +
                "Programmer:         " + this.programmer + "\n";

    }


    public String getProgrammer(){
        return programmer;
    }
    public void setProgrammer(String programmer){
        this.programmer = programmer;
    }

    public String getPlatform(){
        return platform;
    }
        public void setPlatform(String platform){
        this.platform = platform;
    }

    public String getOs(){
        return os;
    }
    public void setOs(String os){
        this.os=os;
    }

}