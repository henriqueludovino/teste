

import java.util.Scanner;

/**
 *
 * @author Henrique Santos Ludovino
 */
public class Henrique_Exercício_Dia_04_04 {

    public static void main(String[] args) {
        try {
            Scanner ler = new Scanner(System.in);
            Produtos prod = new Produtos();
            prod.setCodigo(00001);
            prod.setCodigo2(00002);
            prod.setCodigo3(00003);
            prod.setNome("Bolacha");
            prod.setNome2("Coca-Cola");
            prod.setNome3("Sprite");
            prod.setEstoque(444);
            prod.setEstoque2(443);
            prod.setEstoque3(443);
            prod.setFabricante("Nestlé");
            prod.setFabricante2("Coca-Cola Brasil");
            prod.setFabricante3("Coca-Cola Brasil");
            if (prod.getEstoque() > prod.getEstoque2() && prod.getEstoque() > prod.getEstoque3()) {
                System.out.println("Produto com Maior Estoque:");
                System.out.println("Código: " + prod.getCodigo());
                System.out.println("Produto: " + prod.getNome());
                System.out.println("Quantidade em estoque: " + prod.getEstoque());
                System.out.println("Fabricante: "+prod.getFabricante());
            }
            if (prod.getEstoque2() > prod.getEstoque() && prod.getEstoque2() > prod.getEstoque3()) {
                System.out.println("Produto com Maior Estoque:");
                System.out.println("Código: " + prod.getCodigo2());
                System.out.println("Produto: " +prod.getNome2());
                System.out.println("Quantidade em estoque: " +prod.getEstoque2());
                System.out.println("Fabricante: "+ prod.getFabricante2());
            }
            if (prod.getEstoque3() > prod.getEstoque() && prod.getEstoque3() > prod.getEstoque2()) {
                System.out.println("Produto com Maior Estoque:");
                System.out.println("Código: " + prod.getCodigo3());
                System.out.println("Produto: "+prod.getNome3());
                System.out.println("Quantidade em estoque: " +prod.getEstoque3());
                System.out.println("Fabricante: "+prod.getFabricante3());
            }
        } catch (Exception vetor) {
            System.out.println("ERRO: Valor informado não é de um tipo válido ");
        }
    }

}
