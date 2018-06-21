package com.example.matthijs.thecircleapp;
import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.example.matthijs.thecircleapp.liveVideoBroadcaster.LiveVideoBroadcasterActivity;
import com.example.matthijs.thecircleapp.liveVideoBroadcaster.R;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.Console;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.InvalidKeyException;
import java.security.Signature;

/**
 * A login screen that offers login via username.
 */
public class LoginActivity extends Activity {

    private EditText mUsernameView;
    private EditText mPasswordView;

    private String mUsername;
    private String mPassword;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // Set up the login form.
        //mUsernameView = (EditText) findViewById(R.id.username_input);
        //mPasswordView = (EditText) findViewById(R.id.password_input);
//        mUsernameView.setOnEditorActionListener(new TextView.OnEditorActionListener() {
//            @Override
//            public boolean onEditorAction(TextView textView, int id, KeyEvent keyEvent) {
//                if (id == R.id.login || id == EditorInfo.IME_NULL) {
//                    attemptLogin();
//                    return true;
//                }
//                return false;
//            }
//        });

//        Button signInButton = (Button) findViewById(R.id.sign_in_button);
//        signInButton.setOnClickListener(new OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                attemptLogin();
//            }
//        });

        Button user1Button = (Button) findViewById(R.id.user1_button);
        user1Button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view){

                postApiCall("user1@gmail.com", "25850b54d1a82d156668fb39bd3bc75ae987a293d97c298b8d32bc0b352a4f6264a3aa686923b9d8ccf6ab288cd07bd5430b04f5c11e6e9d8f52acd819cf15da2a79b881bcdc3588bb9c34eb227b5bb0bdf2ac3765f8f32ccefecd82721f9ed8423006b1edf5c3a1e3a6ee08e60236336835c3c36aae6c6078c431a9da4272f4f8716bfc4a5a8b2fd8dfcf72226fc4d234762defef7c7fdc57d4328a7c517d14978b1f01c8e432f225b600e25120715f89e5b01d7e9571587512e5067d335b3f9477b47edb715ccb0612b7b435ada6d1f41c642f2be8cacb847f38caf722e7a25f6f803e014b44f6402cd2eb42feeb2d572413f029d7b42e7edf34729c52ec41");

                Intent myIntent = new Intent(LoginActivity.this, LiveVideoBroadcasterActivity.class);
                String username = "user1@gmail.com";
                myIntent.putExtra("user", username);
                LoginActivity.this.startActivity(myIntent);

            }
        });


        Button user2Button = (Button) findViewById(R.id.user2_button);
        user2Button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view){
                postApiCall("user2@gmail.com", "0aa61aa825dcd72cce31301c2ede38cd6eef813cea670485859bda27f337d8778828bf2f0e1487417fa1eefbce596e045238f2cd9ddbf46ca957c6aebbb75741ebd19795645037d2032008d091eebc5c828fa1287fc4cb8d870d62d9dc313fa5603c1c0b0141a59b23e24a467544ff754ae1377a2ca8ccc14e00ae7576097cb5a96ead36833da6b84bc3f659e8930ce1802707ef6e2cc8742e886437dfc46fc5c2c70d65d29eaffc4eaad88cfa882bffe4aee6689ebca49b87f44c3a8fbea25d6c8aae0cfcf66ba45a29114ca0ba0b707d130268990aabef948c94553f1f9c06fc82e1172e42471d7f6f79ce1f61898c29ac777da92382d8956cca813c6afd70");

                Intent myIntent = new Intent(LoginActivity.this, LiveVideoBroadcasterActivity.class);
                String username = "user2@gmail.com";
                myIntent.putExtra("user", username);
                LoginActivity.this.startActivity(myIntent);
            }
        });

        Button user3Button = (Button) findViewById(R.id.user3_button);
        user3Button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view){
                postApiCall("user3@gmail.com", "76f43fa3d4593d6421d5a06f283631365940f92dc74f4bc928be528f8c27521c1dde1d3bff361ac42ad5e90784569bc7399e2dfb7cdd6c4c8dfb23aef01bb6ac2f649f83cc8856f610ea680d6e5d85d004120c0d7c2a892bba87dbaeec1ff8ea76cc0881fdd78e316eef4bba55a4d805d452af0221c52eabab97f77ba48e6c02258c1b2e6e7357bf8f7fe3696269f58f27bd29b3be4202c5f313e96823e810cb7323f860eeafe6d7d1120a34e7ce58292e6e9d852e6bfefe9a2c8d43e661fef5ff0c4fe11fbf64769fe82b474b9ef326e9cf1f6008e955c9d76dd97085c0f8b0cec1dc4959f0bb571d7abf13f9adf2c93628743867997953e4470ba05a626041");

                Intent myIntent = new Intent(LoginActivity.this, LiveVideoBroadcasterActivity.class);
                String username = "user3@gmail.com";
                myIntent.putExtra("user", username);
                LoginActivity.this.startActivity(myIntent);
            }
        });

        Button user4Button = (Button) findViewById(R.id.user4_button);
        user4Button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view){
                postApiCall("user4@gmail.com", "152b08973105269cd652e42ddb4340d74fce2b6c4eaba06245764c66441a41ab17243bf6f8e9c6e9a44115ab1929b662ecb04042a3058f4868237aab96ba961b90f8a5b06f49c3b62a2ba152ea462abe7e56a7e3ef41ee56fa8f0cad5b56f9a85f895cc7385451bff04f57d0947250b315be9d0dab0bb6a67a634fc149696d67a87c21b15dd74df502723ad8a617eb2bfff2abf509f57ecd40237da58e374e1ace569558d905f0811856c0cc61df040ad663369ab13741259a642e704ead6998fbda2d86931c3536498741defeea4a3fcfc9f349474ae376a473f2441f12b5cf7f78a1b71874da2438297aaa7a31b811f90a66f2165497b9074fbb04a8f3560e");

                Intent myIntent = new Intent(LoginActivity.this, LiveVideoBroadcasterActivity.class);
                String username = "user4@gmail.com";
                myIntent.putExtra("user", username);
                LoginActivity.this.startActivity(myIntent);
            }
        });

        Button user5Button = (Button) findViewById(R.id.user5_button);
        user5Button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view){
                postApiCall("user5@gmail.com", "58320a6abf18c5c6fb55c55b62a870091afee526808a2cf16596db6c0cdba2f27a66ae0881d1f56d0379dcc4870a834d905e0690f9c3945d94584b52b0ce2035e245d2528cc4ed840ea2cc90f9f255cf899b2111320af62b01843cd61649c9e90c01fa298f091bc8effb0be57dcdafe0cbb8cf255c5fb2b6fe63b798377b3162877f6ebf89a3aefca075f86e7eaae487e1e1e1faeba976827924c9990758e1b9096beb42fc796710ff34162aadd8ccbbc210df60fea4253ef18880c90eb639f68374ed068d8ae6e4f773cb711bd073ab4967bcf3cb086bfde1235ad8fcb9a36bb6dc6476a5cc548cf36ee29b75bf07b9c97396133be45c78f23ed71557b4a725");

                Intent myIntent = new Intent(LoginActivity.this, LiveVideoBroadcasterActivity.class);
                String username = "user5@gmail.com";
                myIntent.putExtra("user", username);
                LoginActivity.this.startActivity(myIntent);
            }
        });



    }

    @Override
    protected void onDestroy() {
        super.onDestroy();


    }

    /**
     * Attempts to sign in the account specified by the login form.
     * If there are form errors (invalid username, missing fields, etc.), the
     * errors are presented and no actual login attempt is made.
     */
    private void attemptLogin() {
        // Reset errors.
        mUsernameView.setError(null);

        // Store values at the time of the login attempt.
        String username = mUsernameView.getText().toString().trim();
        String password = mPasswordView.getText().toString().trim();

        // Check for a valid username.
        if (TextUtils.isEmpty(username)) {
            // There was an error; don't attempt login and focus the first
            // form field with an error.
            mUsernameView.setError(getString(R.string.error_field_required));
            mUsernameView.requestFocus();
            return;
        }
        if (TextUtils.isEmpty(password)) {
            // There was an error; don't attempt login and focus the first
            // form field with an error.
            mPasswordView.setError(getString(R.string.error_field_required));
            mPasswordView.requestFocus();
            return;
        }

        mUsername = username;
        mPassword = password;


    }



    public void postApiCall(String email, String sign) {
        try {
            PostAPIRequest postAPIRequest = new PostAPIRequest();
            String url = "/user/rsalogin";
            JSONObject params = new JSONObject();

            try {

                params.put("email", email);
                params.put("signature", sign);
                params.put("transparent", true);
                System.out.println(params);
            } catch (Exception e) {
                e.printStackTrace();
            }
            postAPIRequest.request(LoginActivity.this, fetchPostResultListener, params, url);

            //Toast.makeText(MainActivity.this, "Post API called", Toast.LENGTH_SHORT).show();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    FetchDataListener fetchPostResultListener = new FetchDataListener() {
        @Override
        public void onFetchComplete(JSONObject data) {
            try {
                if (data != null) {
                    String response = data.toString();
                    //resultTextView.setText(response);
                    Toast.makeText(LoginActivity.this, response.toString(), Toast.LENGTH_SHORT).show();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override
        public void onFetchFailure(String msg) {

        }

        @Override
        public void onFetchStart() {

        }
    };
}
