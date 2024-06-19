public class ExemploForArray {
    public static void main(String[] args) {
        //Exemplo da estrutura FOR utilizando Array
        String alunos[] = {"FELIPE", "JONAS", "JULIA", "MARCOS"};

        for (int x=0; x<alunos.length; x++){
            System.out.println("O aluno no indice x= " + x + " é " + alunos[x]);
        }


        System.out.println("=================================================");

        //Exemplo de FOR utilizando Array de forma SIMPLIFICADA
        String funcionarios[] = {"MATHEUS", "ANA", "PATRICK", "JESSICA"};

        for (String funcionario : funcionarios){
            System.out.println("O nome do funcionário é: " + funcionario);
        }
    }
}
