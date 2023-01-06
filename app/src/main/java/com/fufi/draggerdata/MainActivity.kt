package com.fufi.draggerdata

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.ViewModelProvider
import com.fufi.draggerdata.ui.theme.DraggerdataTheme
import com.fufi.draggerdata.viewmodel.MainViewModel
import com.fufi.draggerdata.viewmodel.MainViewModelFactory
import javax.inject.Inject

class MainActivity : ComponentActivity() {

    lateinit var mainViewModel: MainViewModel
    @Inject
    lateinit var mainViewModelFactory: MainViewModelFactory
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //=============================================//
mainViewModel=ViewModelProvider(this,mainViewModelFactory).get(MainViewModel::class.java)

    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    DraggerdataTheme {
        Greeting("Android")
    }
}