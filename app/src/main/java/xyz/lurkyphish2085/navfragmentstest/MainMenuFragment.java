package xyz.lurkyphish2085.navfragmentstest;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;

public class MainMenuFragment extends Fragment implements View.OnClickListener {

    Button gotoA, gotoB, gotoC;
    TextView receivedDataTv;
    NavController navController;

    public MainMenuFragment() {
        super(R.layout.fragment_main_menu);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getActivity().setTitle("Main Menu");

        navController = NavHostFragment.findNavController(this);

        receivedDataTv = view.findViewById(R.id.received_data_tv);
        gotoA = view.findViewById(R.id.goto_a_btn);
        gotoB = view.findViewById(R.id.goto_b_btn);
        gotoC = view.findViewById(R.id.goto_c_btn);
        gotoA.setOnClickListener(this);
        gotoB.setOnClickListener(this);
        gotoC.setOnClickListener(this);

        receivedDataTv.setText(getArguments().getString("Data", "Default Text"));
    }

    @Override
    public void onClick(View view) {
        int viewId = view.getId();
        if (viewId == gotoA.getId()) {
            navController.navigate(R.id.action_mainMenuFragment_to_destinationAFragment);
        }
        if (viewId == gotoB.getId()) {
            navController.navigate(R.id.action_mainMenuFragment_to_destinationBFragment);
        }
        if (viewId == gotoC.getId()) {
            navController.navigate(R.id.action_mainMenuFragment_to_destinationCFragment);
        }
    }
}
