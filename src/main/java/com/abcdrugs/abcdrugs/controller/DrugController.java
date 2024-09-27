package com.abcdrugs.abcdrugs.controller;

import com.abcdrugs.abcdrugs.model.Drug;
import com.abcdrugs.abcdrugs.model.DrugsApiModel;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class DrugController {
    @FXML
    private TextField drugNameField;

    @FXML
    private TextArea resultArea;

    private DrugsApiModel model = new DrugsApiModel(); // Instância do modelo

    // Método para buscar os dados ao clicar no botão de pesquisa
    @FXML
    private void onSearchButtonClick() {
        String drugName = drugNameField.getText();

        try {
            Drug drug = model.getDrugInfo(drugName);
            resultArea.setText(formatDrugInfo(drug));
        } catch (Exception e) {
            resultArea.setText("Erro ao buscar dados: " + e.getMessage());
        }
    }

    // Formata as informações do medicamento para exibição
    private String formatDrugInfo(Drug drug) {
        String s = "Nome Comercial: " + drug.getBrandName() + "\n" +
                "Princípio Ativo: " + drug.getActiveIngredient() + "\n" +
                "Finalidade: " + drug.getPurpose() + "\n" +
                "Uso: " + drug.getUsage();
        return s;
    }
}

