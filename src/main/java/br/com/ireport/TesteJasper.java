package br.com.ireport;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;

public class TesteJasper {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		try {
			// cria beans e coloca na collection
			Cliente bean1 = new Cliente("João", 31);
			Cliente bean2 = new Cliente("Fernando", 43);
			Cliente bean3 = new Cliente("Luis", 24);

			Collection<Cliente> lista = new ArrayList<Cliente>();
			lista.add(bean1);
			lista.add(bean2);
			lista.add(bean3);

			Telefone telefone1  = new Telefone("11","222222222");
			Telefone telefone2  = new Telefone("16","333333333");
			Telefone telefone3  = new Telefone("11","444444444");
			Telefone telefone4  = new Telefone("11","555555555");

			List<Telefone> listaTelefone = new ArrayList<Telefone>();
			listaTelefone.add(telefone1);
			listaTelefone.add(telefone2);
			listaTelefone.add(telefone3);
			listaTelefone.add(telefone4);

			// cria datasource a partir da collection
			JRBeanCollectionDataSource jrds = new JRBeanCollectionDataSource(lista);

			// mapeia parâmetros
			Map parametros = new HashMap();

			parametros.put("listaTelefone", listaTelefone);

			// parâmetro parameter1 deve existir no relatório
			parametros.put("parameter1", "texto via parametro java");

			// preenche relatorio com parâmetros e datasource
			JasperPrint printer = JasperFillManager
					.fillReport("C:\\Users\\Felipe Coelho\\workspace\\ireport\\src\\main\\resources\\jasper\\cliente.jasper", parametros, jrds);

			// abre visualizador
			JasperViewer jv = new JasperViewer(printer, false);
			jv.setTitle("Título da janela do visualizador");
			jv.setVisible(true);

			// grafa relatorio pdf em disco
			FileOutputStream fos = new FileOutputStream(
					"C:\\Users\\Felipe Coelho\\Desktop\\Nova pasta\\relatorio.pdf");

			JasperExportManager.exportReportToPdfStream(printer, fos);
			fos.flush();
			fos.close();

		} catch (Exception e) {
			System.out.println("ERRO ");
			e.printStackTrace();
		}
	}
}
