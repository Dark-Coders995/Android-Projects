package com.darkcoders.barber

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.darkcoders.barber.ui.theme.BarberTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HomeComponent()
        }
    }
}
@Preview
@Composable
fun HomeComponent()
{
    return BarberTheme {
        Scaffold(
            modifier = Modifier
                .background(Color.White)
                .fillMaxSize()
                .padding(16.dp)
        ) {
            TopSection()
        }
    }
}
@Composable
fun TopSection()
{
    return Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Text(
                text = "Hi Ayush",
                color = Color(0xFF222222),
                style = MaterialTheme.typography.h6,
                fontSize = 37.sp,
                textAlign = TextAlign.Start,
                fontWeight = FontWeight.SemiBold
            )
            Icon(
                imageVector = Icons.Default.Search,
                contentDescription = "Search" ,
                tint = Color(0xFF77797A)
            )
        }
        Row(
            modifier = Modifier.padding(4.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = buildAnnotatedString {
                    append("Where To ")
                    withStyle(style = SpanStyle(Color.Red)){
                        append("54 King Ports")
                    }
                },
                color = Color(0xFF222222),
                fontWeight = FontWeight.Medium,
                fontSize = 14.sp,
            )
            Icon(
                painter = painterResource(id = R.drawable.ic_drop_arrow) ,
                contentDescription = "Dropdown",
                modifier = Modifier
                    .padding(start = 4.dp , bottom = 2.dp)
                    .size(10.dp)
            )

        }

    }
}