package com.appstudio.maxime.mrpotatohead;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onCheckboxClicked(View view) {

        boolean checked = ((CheckBox) view).isChecked();

        switch (view.getId()){
            case R.id.arms: case R.id.arms_land:
                ImageView image_arms = (ImageView) findViewById(R.id.image_arms);
                if (checked){
                    image_arms.setVisibility(View.VISIBLE);
                }
                else {
                    image_arms.setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.ears: case R.id.ears_land:
                ImageView image_ears = (ImageView) findViewById(R.id.image_ears);
                if (checked){
                    image_ears.setVisibility(View.VISIBLE);
                }
                else {
                    image_ears.setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.eyebrows: case R.id.eyebrows_land:
                ImageView image_eyebrows = (ImageView) findViewById(R.id.image_eyebrows);
                if (checked){
                    image_eyebrows.setVisibility(View.VISIBLE);
                }
                else {
                    image_eyebrows.setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.eyes: case R.id.eyes_land:
                ImageView image_eyes = (ImageView) findViewById(R.id.image_eyes);
                if (checked){
                    image_eyes.setVisibility(View.VISIBLE);
                }
                else {
                    image_eyes.setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.glasses: case R.id.glasses_land:
                ImageView image_glasses = (ImageView) findViewById(R.id.image_glasses);
                if (checked){
                    image_glasses.setVisibility(View.VISIBLE);
                }
                else {
                    image_glasses.setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.hat: case R.id.hat_land:
                ImageView image_hat = (ImageView) findViewById(R.id.image_hat);
                if (checked){
                    image_hat.setVisibility(View.VISIBLE);
                }
                else {
                    image_hat.setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.mouth: case R.id.mouth_land:
                ImageView image_mouth = (ImageView) findViewById(R.id.image_mouth);
                if (checked){
                    image_mouth.setVisibility(View.VISIBLE);
                }
                else {
                    image_mouth.setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.mustache: case R.id.mustache_land:
                ImageView image_mustache = (ImageView) findViewById(R.id.image_mustache);
                if (checked){
                    image_mustache.setVisibility(View.VISIBLE);
                }
                else {
                    image_mustache.setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.nose: case R.id.nose_land:
                ImageView image_nose = (ImageView) findViewById(R.id.image_nose);
                if (checked){
                    image_nose.setVisibility(View.VISIBLE);
                }
                else {
                    image_nose.setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.shoes: case R.id.shoes_land:
                ImageView image_shoes = (ImageView) findViewById(R.id.image_shoes);
                if (checked){
                    image_shoes.setVisibility(View.VISIBLE);
                }
                else {
                    image_shoes.setVisibility(View.INVISIBLE);
                }
                break;
        }

    }


}
