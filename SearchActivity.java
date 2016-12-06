/**
 * @Author Ricky Clevinger
 * SearchActivity.java
 */

package ricky.bookcomparison;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SearchActivity extends AppCompatActivity {

    String title;
    String ISBN;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        String message = (String) getIntent().getStringExtra("message");
        String message2 = (String) getIntent().getStringExtra("message2");
        String message3 = (String) getIntent().getStringExtra("message3");
        String message4 = (String) getIntent().getStringExtra("message4");
        String message5 = (String) getIntent().getStringExtra("message5");
        TextView radPriceText;
        TextView amaPriceText;
        TextView shelfPriceText;
        TextView BTitleText;
        radPriceText = (TextView) findViewById(R.id.RadPriceText);
        amaPriceText = (TextView) findViewById(R.id.AmazonPriceText);
        shelfPriceText = (TextView) findViewById(R.id.RedshelfPriceText);
        BTitleText = (TextView) findViewById(R.id.BTitleText);
        radPriceText.setText(message);
        shelfPriceText.setText(message2);
        amaPriceText.setText(message3);
        BTitleText.setText(message4);
        title = message4;
        ISBN = message5;
    }

    public void openHomeActivity(View view) {
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }


    public void addList(View view){
            DatabaseAccess databaseAccess = DatabaseAccess.getInstance(this);
            databaseAccess.open();
            databaseAccess.addList(title);
            databaseAccess.close();
    }

    public void openAmazon(View view){
        Uri uri = Uri.parse("http://www.amazon.com/gp/search/ref=sr_adv_b/?search-alias=stripbooks&unfiltered=1&field-keywords=&field-author=&field-title=&field-isbn=" + ISBN + "&field-publisher=&node=&field-p_n_condition-type=&p_n_feature_browse-bin=&field-age_range=&field-language=&field-dateop=During&field-datemod=&field-dateyear=&sort=relevanceexprank&Adv-Srch-Books-Submit.x=0&Adv-Srch-Books-Submit.y=0");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);

    }

    public void openRadford(View view){
        Uri uri = Uri.parse("http://radfordu.bncollege.com/webapp/wcs/stores/servlet/ProductSearchCommand?displayImage=N&catalogId=10001&langId=-1&storeId=87897&extSearchEnabled=G&search=" + ISBN);
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);

    }

    public void openRedshelf(View view){
        Uri uri = Uri.parse("https://www.google.com/webhp?hl=en#hl=en&q=site:redshelf.com+" + ISBN);
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);

    }
}
