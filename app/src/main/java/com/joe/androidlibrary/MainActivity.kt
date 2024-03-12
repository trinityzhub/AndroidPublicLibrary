package com.joe.androidlibrary

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.plcoding.androidlibrary.R
import com.joe.androidlibrary.ui.theme.AndroidLibraryTheme
import com.joe.droid.preview.ImagePreview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidLibraryTheme {
                Box(modifier = Modifier.fillMaxSize()) {
                    
                    ImagePreview(
                        image = painterResource(id = R.drawable.kermit),
                        description = "Test",
                        modifier = Modifier.align(Alignment.Center).size(150.dp)

                    )

                }
            }
        }
    }
}
