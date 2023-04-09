package xyz.lurkyphish2085.navfragmentstest;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class DestinationBFragment extends Fragment {

    public DestinationBFragment() {
        super(R.layout.fragment_b);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        getActivity().setTitle("Destination B");
        return super.onCreateView(inflater, container, savedInstanceState);
    }
}
