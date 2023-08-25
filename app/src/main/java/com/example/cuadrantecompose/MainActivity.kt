package com.example.cuadrantecompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.cuadrantecompose.ui.theme.CuadranteComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CuadranteComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BoxInfoCard()
                }
            }
        }
    }
}


@Composable
fun BoxInfoCard(){
    Column (
        Modifier.fillMaxWidth()
    ) {
        Row (Modifier.weight(1f)) {
            InfoCard(
                titulo = stringResource(R.string.first_title),
                texto = stringResource(R.string.first_description),
                background = Color(0xFFEADDFF),
                modifier = Modifier.weight(1f)
            )
            InfoCard(
                titulo = stringResource(R.string.second_title),
                texto = stringResource(R.string.second_description),
                background = Color(0xFFD0BCFF),
                modifier = Modifier.weight(1f)
            )
        }
        Row (Modifier.weight(1f)){
            InfoCard(
                titulo = stringResource(R.string.third_title),
                texto = stringResource(R.string.third_description),
                background = Color(0xFFB69DF8),
                modifier = Modifier.weight(1f)
            )
            InfoCard(
                titulo = stringResource(R.string.fourth_title),
                texto = stringResource(R.string.fourth_description),
                background = Color(0xFFF6EDFF),
                modifier = Modifier.weight(1f)
            )
        }
    }
}


@Composable
fun InfoCard(
    titulo:String,
    texto: String,
    background: Color,
    modifier:Modifier = Modifier
){
    Column (
        modifier = modifier
            .fillMaxSize()
            .background(background)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(
            text = titulo,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(16.dp)
            )
        Text(
            text = texto,
            textAlign = TextAlign.Justify
        )
    }
}




@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CuadranteComposeTheme {
        BoxInfoCard()
    }
}