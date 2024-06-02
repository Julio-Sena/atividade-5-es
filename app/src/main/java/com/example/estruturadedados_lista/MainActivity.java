package com.example.estruturadedados_lista;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Produto> produtos;
    private ArrayAdapter<Produto> adapter;
    private ListView productListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        productListView = findViewById(R.id.productListView);
        Button addProductButton = findViewById(R.id.addProductButton);

        produtos = new ArrayList<>();
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, produtos);
        productListView.setAdapter(adapter);

        addProductButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Abra a atividade para adicionar/editar um produto
                // Intent intent = new Intent(MainActivity.this, EditProductActivity.class);
                // startActivity(intent);
                Toast.makeText(MainActivity.this, "Implementar tela de adição/edição de produto", Toast.LENGTH_SHORT).show();
            }
        });

        productListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Produto selectedProduct = produtos.get(position);
                // Abra a atividade para visualizar/editar o produto selecionado
                // Intent intent = new Intent(MainActivity.this, ViewProductActivity.class);
                // intent.putExtra("product", selectedProduct);
                // startActivity(intent);
                Toast.makeText(MainActivity.this, "Implementar tela de visualização/edição de produto: " + selectedProduct.getNome(), Toast.LENGTH_SHORT).show();
            }
        });

        // Carregue a lista inicial de produtos do banco de dados ou outra fonte de dados
        loadProductList();
    }

    private void loadProductList() {
        // Dados fictícios para teste
        produtos.add(new Produto("Produto 1", "Marca 1", "Vermelho", 10.0f));
        produtos.add(new Produto("Produto 2", "Marca 2", "Azul", 20.0f));
        produtos.add(new Produto("Produto 3", "Marca 3", "Verde", 30.0f));
        adapter.notifyDataSetChanged();
    }
}
