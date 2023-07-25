package jp.suntech.s22020.kadai12;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

import com.google.android.material.snackbar.Snackbar;

public class ConfirmDialogFragment extends DialogFragment {
    @NonNull
    @Override

    public Dialog onCreateDialog(@Nullable Bundle saveInstanceState){
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle(R.string.dialog_title);
        builder.setMessage(R.string.dialog_confirm);
        builder.setPositiveButton(R.string.dialog_ok, new DialogButtonClickListener());
        //
        builder.setNegativeButton("キャンセル",new DialogButtonClickListener());
        AlertDialog dialog = builder.create();
        return dialog;
    }

    public class DialogButtonClickListener implements DialogInterface.OnClickListener {
        @Override
        public void onClick(DialogInterface dialog, int which) {
            //
            String msg = "";
            //
            switch (which) {
                //
                case DialogInterface.BUTTON_POSITIVE:
                    //
                  //  Toast.makeText(getActivity(), msg, Toast.LENGTH_LONG).show();
                    break;
                case DialogInterface.BUTTON_NEGATIVE:
                    //
                   // Toast.makeText(getActivity(), msg, Toast.LENGTH_LONG).show();
                    break;
            }
            //
            //Toast.makeText(getActivity(), msg, Toast.LENGTH_LONG).show();
        }

    }
}
