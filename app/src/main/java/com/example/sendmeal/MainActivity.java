package com.example.sendmeal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Region;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    public EditText txtNombreyApellido;
    public EditText txtContrasenia;
    public EditText txtRepetirContrasenia;
    public EditText txtEmail;
    public RadioButton rbtTarjetaDebito;
    public RadioButton rbtTarjetaCredito;
    public EditText txtCbu;
    public EditText txtNumeroTarjeta,txtCvv;
   public Button btnRegistar;
   public CheckBox cbxTermino;
   public SeekBar seekBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNombreyApellido = findViewById(R.id.txtNombreyApellido);
        txtContrasenia = findViewById(R.id.txtContrasenia);
        txtRepetirContrasenia = findViewById(R.id.txtRepetirContrasenia);
        txtEmail = findViewById(R.id.txtEmail);
        rbtTarjetaCredito = findViewById(R.id.rbtTarjetaCredito);
        rbtTarjetaDebito = findViewById(R.id.rbtTarjetaDebito);
        txtCbu = findViewById(R.id.txtCbu);
        txtCvv = findViewById(R.id.txtCvv);
        txtNumeroTarjeta = findViewById(R.id.txtNumeroTarjeta);

        final EditText rtdoSeekBar = new EditText(this);
        btnRegistar = findViewById(R.id.btnRegistrar);

        cbxTermino = findViewById(R.id.cbxTerminos);
        //aca sabemos si selecciono el checkBox que acepta terminos y condiciones
        boolean cbxTerminoResponse = cbxTermino.isChecked();

        rbtTarjetaDebito = findViewById(R.id.rbtTarjetaDebito);
        boolean rbtTarjetaDebitoResponse = rbtTarjetaDebito.isChecked();

        rbtTarjetaCredito = findViewById(R.id.rbtTarjetaCredito);
        boolean rbtTarjetaCreditoResponse = rbtTarjetaDebito.isChecked();

        seekBar= findViewById(R.id.seekBar);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                rtdoSeekBar.setText(String.valueOf(new Integer(progress)));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        btnRegistar.setOnClickListener( new OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Context context = getApplicationContext();
                CharSequence text = "Error existen campos vacios";
                int duration = Toast.LENGTH_SHORT;

                if(txtNombreyApellido.getText().toString().isEmpty()){
                    Toast.makeText(context, text, duration).show();
                }else
                if(txtContrasenia.getText().toString().isEmpty()) {
                    Toast.makeText(context,text,duration).show();
                }else
                if(txtRepetirContrasenia.getText().toString().isEmpty()){
                    Toast.makeText(context,text,duration).show();
                }else if(txtCbu.getText().toString().isEmpty()) {
                    Toast.makeText(context, text, duration).show();

                }else if (txtCvv.getText().toString().isEmpty())
                    Toast.makeText(context, text, duration).show();
            }
            String NombreyApellido = txtNombreyApellido.getText().toString();
            String contrasenia = txtContrasenia.getText().toString();
            String repetirContrasenia = txtRepetirContrasenia.getText().toString();
            String email = txtEmail.getText().toString();
            String numeroTarjeta = txtNumeroTarjeta.getText().toString();
            String cbu = txtCbu.getText().toString();
            String cvv = txtCvv.getText().toString();
        });
}
}