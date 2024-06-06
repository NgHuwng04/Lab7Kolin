package com.hungnn.lab7kolin.BaiTap

import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import com.hungnn.lab7kolin.MainViewModel
import com.hungnn.lab7kolin.ui.screens.MovieScreen

@Composable
fun Bai1(){
    val mainViewModel = MainViewModel()
    val moviesState = mainViewModel.movies.observeAsState(initial = emptyList())
    MovieScreen(movies = moviesState.value)
}