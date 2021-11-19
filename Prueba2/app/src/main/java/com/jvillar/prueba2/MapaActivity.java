package com.jvillar.prueba2;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.jvillar.prueba2.databinding.ActivityMapaBinding;

public class MapaActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityMapaBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMapaBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.mapa);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        LatLng temuco = new LatLng(-38.7313285, -72.6040094);
        LatLng valdivia = new LatLng(-39.8175743, -73.2333235);
        LatLng rancagua = new LatLng(-34.1720908, -70.7362821);
        LatLng santiago = new LatLng(-33.4491896,-70.662131);
        LatLng puerto_montt = new LatLng(-41.4724796,-72.9294901);
        LatLng concepcion = new LatLng(-36.8263775, -73.0610344);
        LatLng antofagasta = new LatLng(-23.6345493, -70.3939139);
        LatLng arica = new LatLng(-18.4835947, -70.3104124);
        LatLng la_serena = new LatLng(-29.9085027, -71.2577469);
        LatLng viña_del_mar = new LatLng(-33.0376143, -71.5227317);

        mMap.addMarker(new MarkerOptions().position(temuco).title("Santo tomas temuco "));
        mMap.addMarker(new MarkerOptions().position(valdivia).title("Santo tomas valdivia"));
        mMap.addMarker(new MarkerOptions().position(rancagua).title("Santo tomas rancagua"));
        mMap.addMarker(new MarkerOptions().position(santiago).title("instituto santo tomas santiago"));
        mMap.addMarker(new MarkerOptions().position(puerto_montt).title("Santo tomas puerto montt"));
        mMap.addMarker(new MarkerOptions().position(concepcion).title("Santo tomas concepcion"));
        mMap.addMarker(new MarkerOptions().position(antofagasta).title("Santo tomas antofagasta"));
        mMap.addMarker(new MarkerOptions().position(arica).title("Santo tomas arica"));
        mMap.addMarker(new MarkerOptions().position(la_serena).title("Santo tomas la serena"));
        mMap.addMarker(new MarkerOptions().position(viña_del_mar).title("Santo tomas viña del mar"));



        mMap.moveCamera(CameraUpdateFactory.newLatLng(temuco));
    }
}