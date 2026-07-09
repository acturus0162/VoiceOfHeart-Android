package com.example.myapplication.ui.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.R
import com.example.myapplication.ui.component.CommonButton
import com.example.myapplication.ui.theme.KuitColors
import com.example.myapplication.ui.theme.KuitTheme
import com.example.myapplication.ui.theme.MyApplicationTheme

@Composable
fun LoginScreen(
    modifier:Modifier= Modifier,
){

    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Box(
        modifier=modifier.fillMaxSize()
    ){
        Image(
            painter= painterResource(id=R.drawable.login_background),
            contentDescription = null,
            modifier= Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )

        Column(
            modifier=modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            TextField(
                value=email,
                onValueChange = {email=it},
                placeholder = {
                    Text(
                        text="이메일",
                        color= KuitTheme.colors.gray2,
                        style = KuitTheme.typography.M_14
                    )
                },
                singleLine = true,
                shape= RoundedCornerShape(12.dp),
                colors = TextFieldDefaults.colors(
                    focusedContainerColor = KuitTheme.colors.white,
                    unfocusedContainerColor = KuitTheme.colors.white,
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent,
                    cursorColor = KuitTheme.colors.main1
                ),
                modifier=modifier
                    .width(345.dp)
                    .height(50.dp)
            )

            Spacer(modifier= Modifier.height(12.dp))

            TextField(
                value=password,
                onValueChange = {password=it},
                placeholder = {
                    Text(
                        text="비밀번호",
                        color= KuitTheme.colors.gray2,
                        style = KuitTheme.typography.M_14
                    )
                },
                singleLine = true,
                shape= RoundedCornerShape(12.dp),
                colors = TextFieldDefaults.colors(
                    focusedContainerColor = KuitTheme.colors.white,
                    unfocusedContainerColor = KuitTheme.colors.white,
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent,
                    cursorColor = KuitTheme.colors.main1
                ),
                modifier=modifier
                    .width(345.dp)
                    .height(50.dp)
            )

            Spacer(modifier= Modifier.height(12.dp))

            Text(
                modifier=modifier
                    .width(77.dp)
                    .height(17.dp)
                    .clickable{
                        println("구현x")
                    },
                text="회원가입 하기",
                color= KuitTheme.colors.white,
                style= KuitTheme.typography.M_14,
                textDecoration = TextDecoration.Underline
            )

            Spacer(modifier= Modifier.height(39.dp))

            CommonButton(
                onClick = {println("구현x")},
                buttonName = "로그인"
            )

            Spacer(modifier= Modifier.height(22.43.dp))
        }
    }


}


@Preview(showBackground = true)
@Composable
private fun LoginScreenPreview(){
    LoginScreen()
}