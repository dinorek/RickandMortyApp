package cl.inacap.rickandmortyapp.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import cl.inacap.rickandmortyapp.fragments.PersonajesFragment;
import cl.inacap.rickandmortyapp.fragments.UbicacionesFragment;

public class TabsNavPageAdapter extends FragmentStatePagerAdapter {
    public TabsNavPageAdapter(@NonNull FragmentManager fm) {
        super(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
    }
    //Codigo que se ejecuta cuando cambia de tab:
    @NonNull
    @Override
    public Fragment getItem(int position) {
            switch(position){
                case 0: return new PersonajesFragment();
                case 1: return new UbicacionesFragment();
                default: return null;
            }
        }
     //Devuelvo la cantidad de tabs:
    @Override
    public int getCount() {
        return 2;
    }
}
