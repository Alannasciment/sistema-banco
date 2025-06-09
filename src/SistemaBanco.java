public class SistemaBanco {
    public static void main(String[] args) {
        Usuario u = new Usuario("Carlos", 25);
        Conta conta = new Conta(12345);
        u.setConta(conta);

        u.getConta().depositar(100);
        u.getConta().sacar(50);

        System.out.println("Usuário: " + u.getNome() + ", Idade: " + u.getIdade());
        System.out.println("Conta: " + u.getConta().getNumeroConta() + ", Saldo: " + u.getConta().getSaldo());
    }
}
