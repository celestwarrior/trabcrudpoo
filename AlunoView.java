package view;

import java.util.Scanner;

import bo.Aluno;
import controller.AlunoController;

public class AlunoView {

	public void create() {

		Scanner in = new Scanner(System.in);

		Aluno aluno = new Aluno();

		System.out.println("Entre com a matricula:");
		aluno.setMatricula(in.next());

		System.out.println("Entre com o nome: ");
		aluno.setNome(in.next());

		System.out.println("Entre com a Cidade:");
		aluno.setCidade(in.next());

		AlunoController controller = new AlunoController();
		controller.create(aluno);

	}

	public void read() {
		AlunoController controller = new AlunoController();

		System.out.println("Listagem de alunos");
		System.out.println("******************");

		for (Aluno aluno : controller.read()) {
			System.out.println("Aluno matr:" + aluno.getMatricula());
			System.out.println("Aluno nome:" + aluno.getNome());
			System.out.println("Aluno cidade:" + aluno.getCidade());
			System.out.println("-----------------------------------");

		}

	}

	public void update() {
		String sql = "UPDATE Aluno set Matricula=0 where Matricula=null";
		Statement aluno = connectio.Aluno();
	}

	public void delete() {
		sql = "Delete FROM Aluno where matricula=0";
	}

	public static void main(String[] args) {
		// inicia

		AlunoView crud = new AlunoView();

		System.out.println("Qual ação do CRUD?");
		Scanner in = new Scanner(System.in);

		String resposta = in.next();

		if (resposta.equalsIgnoreCase("c"))
			crud.create();
		else
			crud.read();

	}

}