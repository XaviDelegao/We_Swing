package com.example.weswinng.fragments;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.weswinng.R;


public class AvisFragment extends DialogFragment {
    TextView message;

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = requireActivity().getLayoutInflater();
        View v = inflater.inflate(R.layout.avis, null);

        builder.setPositiveButton("D'acord", (DialogInterface.OnClickListener) (dialog, id) -> {})
                .setNegativeButton("Cancela", (DialogInterface.OnClickListener) (dialog, id) -> {});

        builder.setView(v);

        message = v.findViewById(R.id.avis_msg);
        message.setText("Es notificara a la escola de que vols registrarte com profesor");

        return builder.create();
    }
}