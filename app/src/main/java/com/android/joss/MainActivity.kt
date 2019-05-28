package com.android.joss

import android.Manifest
import android.app.Activity
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.location.Criteria
import android.location.LocationManager
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v4.app.ActivityCompat
import android.support.v4.content.ContextCompat
import android.support.v7.app.AlertDialog
import android.view.View
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.Marker
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : BaseActivity(), OnMapReadyCallback, GoogleMap.OnMarkerClickListener {

  companion object {
    private const val MY_LOCATION_REQUEST_CODE = 329
    private const val NEW_REMINDER_REQUEST_CODE = 330
    private const val EXTRA_LAT_LNG = "EXTRA_LAT_LNG"

    fun newIntent(context: Context, latLng: LatLng): Intent {
      val intent = Intent(context, MainActivity::class.java)
      intent.putExtra(EXTRA_LAT_LNG, latLng)
      return intent
    }
  }
