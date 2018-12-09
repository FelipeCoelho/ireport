package br.com.ireport;

import java.io.FileOutputStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;

public class TestePreviaReembolsoJasper {
	public static void main(String[] args) {

		// TODO Auto-generated method stub
		try {
			// cria beans e coloca na collection
			PreviaReembolsoRel previa = new PreviaReembolsoRel();

			// previa.setDataSolicitacao(new LocalDateTime());

			previa.setNumeroCarteira("123456789");
			previa.setNumRbl(12345l);
			previa.setNomeBeneficiario("João Da Silva Sauro");
			previa.setNomeEstipulante("Marcos v Da Silva");
			previa.setNomeSubEstipulante("Maria Da Conceição");
			previa.setNomeTitular("Luiz Carlos");
			previa.setNumeroCarteiraTitular("987654321");
			previa.setPlano("unimedi ltda");
			previa.setProtocolo("456123789");
			previa.setRede("Farmacia da Sonia");

			ItemPreviaRel itemPrevia1 = new ItemPreviaRel();
			ItemPreviaRel itemPrevia2 = new ItemPreviaRel();

			itemPrevia1.setCdItem("1");
			itemPrevia1.setDescricao("Produto Hospitalar");
			itemPrevia1.setQuantidade(5);
			itemPrevia1.setValorInformado(new BigDecimal("155.00"));
			itemPrevia1.setValorReembolsavel(new BigDecimal("200.00"));

			itemPrevia2.setCdItem("2");
			itemPrevia2.setDescricao("Produto Hospitalar Fabrica");
			itemPrevia2.setQuantidade(2);
			itemPrevia2.setValorInformado(new BigDecimal("100.00"));
			itemPrevia2.setValorReembolsavel(new BigDecimal("20.00"));

			List<ItemPreviaRel> listaItemPrevia = new ArrayList<ItemPreviaRel>();

			listaItemPrevia.add(itemPrevia1);
			listaItemPrevia.add(itemPrevia2);

			// cria datasource a partir da collection
			JRBeanCollectionDataSource jrds = new JRBeanCollectionDataSource(Arrays.asList(previa));

			// mapeia parâmetros
			Map parametros = new HashMap();

			parametros.put("listaItemPrevia", listaItemPrevia);

			// parâmetro parameter1 deve existir no relatório
			parametros.put("parameter1", "texto via parametro java");
			parametros.put("PREVIA_REEMBOLSO_SUB", "C:\\Users\\Felipe Coelho\\workspace\\ireport\\src\\main\\resources\\jasper\\resource\\");

			// preenche relatorio com parâmetros e datasource
			JasperPrint printer = JasperFillManager.fillReport(
					"C:\\Users\\Felipe Coelho\\workspace\\ireport\\src\\main\\resources\\jasper\\resource\\previaReembolso.jasper",
					parametros, jrds);

			// abre visualizador
			JasperViewer jv = new JasperViewer(printer, false);
			jv.setTitle("Título da janela do visualizador");
			jv.setVisible(true);

			// grafa relatorio pdf em disco
			FileOutputStream fos = new FileOutputStream("C:\\Users\\Felipe Coelho\\Desktop\\Nova pasta\\relatorio.pdf");

			JasperExportManager.exportReportToPdfStream(printer, fos);
			fos.flush();
			fos.close();

		} catch (Exception e) {
			System.out.println("ERRO ");
			e.printStackTrace();
		}
	}
}
