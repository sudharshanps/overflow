package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping(value = "/", produces = "text/html")
    public String home() {

        return """
        <!DOCTYPE html>
        <html>
        <head>
            <title>Cloud Backend</title>

            <style>
                *{
                    margin:0;
                    padding:0;
                    box-sizing:border-box;
                    font-family:Segoe UI,sans-serif;
                }

                body{
                    display:flex;
                    justify-content:center;
                    align-items:center;
                    height:100vh;
                    background:linear-gradient(135deg,#0f172a,#2563eb,#38bdf8);
                }

                .card{
                    width:700px;
                    background:white;
                    padding:40px;
                    border-radius:20px;
                    text-align:center;
                    box-shadow:0 20px 40px rgba(0,0,0,.25);
                }

                h1{
                    color:#2563eb;
                    font-size:42px;
                    margin-bottom:15px;
                }

                h2{
                    color:#374151;
                    margin-bottom:20px;
                }

                p{
                    color:#6b7280;
                    line-height:1.7;
                    font-size:18px;
                }

                .status{
                    margin:30px auto;
                    display:inline-block;
                    background:#16a34a;
                    color:white;
                    padding:12px 30px;
                    border-radius:30px;
                    font-size:18px;
                    font-weight:bold;
                }

                .grid{
                    display:grid;
                    grid-template-columns:repeat(2,1fr);
                    gap:20px;
                    margin-top:35px;
                }

                .box{
                    background:#eff6ff;
                    padding:20px;
                    border-radius:15px;
                    transition:.3s;
                }

                .box:hover{
                    transform:translateY(-5px);
                }

                footer{
                    margin-top:35px;
                    color:#6b7280;
                    font-size:15px;
                }
            </style>

        </head>

        <body>

        <div class="card">

            <h1>☁️ Cloud Backend</h1>

            <h2>Spring Boot Application</h2>

            <div class="status">
                ✅ Backend Running Successfully
            </div>

            <p>
                Welcome to my Spring Boot backend application deployed on
                <b>AWS EC2</b>. This project demonstrates successful cloud
                deployment using Java, Maven, GitHub and Amazon EC2.
            </p>

            <div class="grid">

                <div class="box">
                    <h3>☕ Java 21</h3>
                    <p>Backend Runtime</p>
                </div>

                <div class="box">
                    <h3>🚀 Spring Boot</h3>
                    <p>REST API Framework</p>
                </div>

                <div class="box">
                    <h3>☁️ AWS EC2</h3>
                    <p>Cloud Hosting</p>
                </div>

                <div class="box">
                    <h3>📦 Maven</h3>
                    <p>Build Tool</p>
                </div>

            </div>

            <footer>
                Developed by <b>Sudharshan P S</b><br><br>
                Cloud Computing Practical Assessment 2026
            </footer>

        </div>

        </body>
        </html>
        """;
    }
}