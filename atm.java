// Basit ATM programı
public class Degiskenler {

   
    public static void main(String[] args) {
    
        Scanner scanner= new Scanner(System.in);
        
       int bakiye= 5000;
       
       String islemler= "1. işlem: Bakiye Sorgulama\n"
                        +"2. işlem: Para çekme\n"
                        +"3. işlem: Para Yatırma\n"
                        +"4. işlem: Para Transferi\n"
                        +"Çıkış için X'e basınız";
      
               
        System.out.println("----------------------");
        System.out.println(islemler);
        System.out.println("----------------------");
        
        while(true){
            System.out.println("Yapmak istediğiniz işlemi seçiniz: ");
            String islem = scanner.nextLine();
            
            if(islem.equals("X")){
                System.out.println("Lütfen kartınızı alınız, iyi günler dileriz...");
                break;
            }
            else if(islem.equals("1")){
                System.out.println("Bakiyeniz: "+bakiye);
            }
            else if(islem.equals("2")){
                System.out.println("Çekmek istediğiniz tutar :");
                int tutar= scanner.nextInt();
                scanner.nextLine();
                
               if(bakiye- tutar<0){
                   System.out.println("Yeterli Bakiye Yok!\n  Bakiyeniz: "+bakiye);
               }
               else{
                   bakiye -=tutar;
                   System.out.println("Kalan Bakiye : "+bakiye);
               }
            }
            else if(islem.equals("3")){
                System.out.println("Yatırmak istediğiniz tutar :");
                int tutar= scanner.nextInt();
                scanner.nextLine();
                bakiye+= tutar;
                System.out.println("Yeni Bakiyeniz: "+bakiye);
                 
            } 
            else if(islem.equals("4")){
                System.out.println("Transfer etmek istediğiniz miktar: ");
                int tutar= scanner.nextInt();
                scanner.nextLine();
                if(bakiye<tutar){
                    System.out.println("Yetersiz Bakiye!");
                }
                else{
                    bakiye-=tutar;
                    System.out.println("Para transferiniz başarıyla gerçekleştirildi! Kalan bakiyeniz: "+bakiye);
                }
            }
            else{
                System.out.println("Hata! Geçersiz İşlem...");
            }
        }
    }
 }
 
