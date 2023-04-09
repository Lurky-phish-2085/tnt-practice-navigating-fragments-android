package xyz.lurkyphish2085.navfragmentstest;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class DestinationCFragment extends Fragment {

    public DestinationCFragment() {
        super(R.layout.fragment_c);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        getActivity().setTitle("Destination C");
        return super.onCreateView(inflater, container, savedInstanceState);
    }
}
