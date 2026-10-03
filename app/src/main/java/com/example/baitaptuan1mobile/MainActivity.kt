package com.example.baitaptuan1mobile
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.material3.Text
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.layout.ContentScale
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.TopAppBar
class MainActivity : ComponentActivity(){

    override fun onCreate(savedInstanceState :
    Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            StudentProfile()
        }
    }
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun StudentProfile() {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment =
Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        TopAppBar(
            title = {
                Text(text = " ")
            },
            navigationIcon= {
                IconButton(
                    onClick = {
                    }
                        ){
                    Text(text="←")
                }
            },
            actions = {
                IconButton(
                    onClick = {
                    }
                ){
                    Text(text=" Edit"
                    )
                }
            }
        )

        Image(
            painter =
    painterResource(R.drawable.anh_thinh),
            contentDescription =" Ảnh Sinh Viên",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(170.dp)
                .clip(CircleShape)
        )
        Text(
            text = "Trần Quốc Thịnh",
            fontSize = 24.sp
        )
        Text(
            text = " Mssv:058206007242 ",
            fontSize = 22.sp
        )
    }
}
