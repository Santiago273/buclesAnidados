public class PiramideAbecedario {
    String []abecedario = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};

    public void piramide(){
        for (int i = 0; i < abecedario.length; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(abecedario[j]);
            }
            System.out.println("\n");
        }
    }


}
