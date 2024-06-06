package com.hungnn.lab7kolin.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.hungnn.lab7kolin.BaiTap.Bai1
import com.hungnn.lab7kolin.BaiTap.Bai2

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Bai1()
            Bai2()
        }
    }
}