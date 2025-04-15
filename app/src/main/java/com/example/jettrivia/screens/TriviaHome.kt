package com.example.jettrivia.screens

import androidx.compose.runtime.Composable
//import dagger.hilt.android.lifecycle.HiltViewModel
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.jettrivia.component.Questions


@Composable
fun TriviaHome(viewModel: QuestionViewModel = hiltViewModel()){
    Questions(viewModel)
}
