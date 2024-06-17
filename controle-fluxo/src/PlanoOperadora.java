public class PlanoOperadora {
    public static void main(String[] args) {
        //Exemplo de switch/case sem o uso do break

        String plano = "M";

        switch (plano) {
            case "T":{
                System.out.println("5Gb Youtube");
            }

            case "M":{
                System.out.println("Whats e Instagram grátis");
            }

            case "B":{
                System.out.println("100 minutos de ligação");
            }
        }
    }
}
