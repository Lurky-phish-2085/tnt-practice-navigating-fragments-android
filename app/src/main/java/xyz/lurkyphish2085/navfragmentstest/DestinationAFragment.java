package xyz.lurkyphish2085.navfragmentstest;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;

public class DestinationAFragment extends Fragment implements View.OnClickListener {

    Button accept;
    EditText dataEt;
    NavController navController;

    String data;

    public DestinationAFragment() {
        super(R.layout.fragment_a);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        getActivity().setTitle("Destination A");
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        navController = NavHostFragment.findNavController(this);
        dataEt = view.findViewById(R.id.a_et);
        accept = view.findViewById(R.id.accept_a_btn);
        accept.setOnClickListener(this);

        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == accept.getId()) {
            data = dataEt.getText().toString() + "\nFROM DEST A";
            Bundle bundle = new Bundle();
            bundle.putString("Data", data);
            navController.navigate(R.id.action_destinationAFragment_to_mainMenuFragment, bundle);
        }
    }
}
