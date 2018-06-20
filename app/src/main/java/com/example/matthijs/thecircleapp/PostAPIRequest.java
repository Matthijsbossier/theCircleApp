package com.example.matthijs.thecircleapp;

import android.content.Context;
import android.content.Intent;

import com.android.volley.NoConnectionError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.example.matthijs.thecircleapp.liveVideoBroadcaster.LiveVideoBroadcasterActivity;

import org.json.JSONException;
import org.json.JSONObject;

public class PostAPIRequest {



    public void request(final Context context, final FetchDataListener listener, JSONObject params, final String ApiURL) throws JSONException {
        if (listener != null) {
            //call onFetchComplete of the listener
            //to show progress dialog
            //-indicates calling started
            listener.onFetchStart();
        }
        //base server URL
        String baseUrl="http://188.166.29.146:3000";
        //add extension api url received from caller
        //and make full api
        String url = baseUrl + ApiURL;
        //Requesting with post body as params
        JsonObjectRequest postRequest = new JsonObjectRequest(Request.Method.POST, url, params,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        try {
                            if (listener != null) {
                                if(response.has("result")) {

                                    //received response
                                    //call onFetchComplete of the listener
                                    System.out.println(response);
                                    listener.onFetchComplete(response);
                                    System.out.println("Verified connection to server");
                                }else if(response.has("error")){
                                    //has error in response
                                    //call onFetchFailure of the listener
                                    listener.onFetchFailure(response.getString("response"));
                                } else{
                                    listener.onFetchComplete(null);
                                }
                            }
                        }catch (JSONException e){
                            e.printStackTrace();
                        }
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                if (error instanceof NoConnectionError) {
                    listener.onFetchFailure("Network Connectivity Problem");
                } else if (error.networkResponse != null && error.networkResponse.data != null) {
                    VolleyError volley_error = new VolleyError(new String(error.networkResponse.data));
                    String errorMessage      = "";
                    try {
                        JSONObject errorJson = new JSONObject(volley_error.getMessage().toString());
                        if(errorJson.has("status")) errorMessage = errorJson.getString("result");
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                    if (errorMessage.isEmpty()) {
                        errorMessage = volley_error.getMessage();
                    }

                    if (listener != null) listener.onFetchFailure(errorMessage);
                } else {
                    listener.onFetchFailure("Something went wrong. Please try again later");
                }

            }
        });

        RequestQueueService.getInstance(context).addToRequestQueue(postRequest.setShouldCache(false));
    }
}