package seoyeon.kr.hs.emirim.favoritepet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener,View.OnClickListener{
    CheckBox checkselect;
    TextView textQuewst;
    RadioGroup rg;
    RadioButton radioDog, radiofish, radiokol;
    Button butok;
    ImageView imgvPet;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        checkselect=(CheckBox)findViewById(R.id.check_select);
        rg=(RadioGroup) findViewById(R.id.rg);
        radioDog=(RadioButton)findViewById(R.id.radio_dog);
        radiokol=(RadioButton)findViewById(R.id.radio_kol);
        butok=(Button)findViewById(R.id.but_ok);
        imgvPet=(ImageView)findViewById(R.id.imgv_pet);
        checkselect.setOnCheckedChangeListener(this);
        textQuewst=(TextView)findViewById(R.id.text_quest);
        butok.setOnClickListener(this);
    }//end onCreate
    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        if(checkselect.isChecked()){
            textQuewst.setVisibility(View.VISIBLE);
            rg.setVisibility(View.VISIBLE);
            butok.setVisibility(View.VISIBLE);
            imgvPet.setVisibility(View.VISIBLE);
        }
        else{
            textQuewst.setVisibility(View.INVISIBLE);
            rg.setVisibility(View.INVISIBLE);
            butok.setVisibility(View.INVISIBLE);
            imgvPet.setVisibility(View.INVISIBLE);
        }

    }

    @Override
    public void onClick(View view) {
        switch(rg.getCheckedRadioButtonId()){ //사진 불러오기
            case R.id.radio_dog:
                imgvPet.setImageResource(R.drawable.images);
                break;
            case R.id.radio_fish:
                imgvPet.setImageResource(R.drawable.fish);
                break;
            case R.id.radio_kol:
                imgvPet.setImageResource(R.drawable.koala);
                break;
            default:
                Toast.makeText(this,"버튼 선택 안하셨네욤 ",Toast.LENGTH_SHORT).show();

        }
    }
}