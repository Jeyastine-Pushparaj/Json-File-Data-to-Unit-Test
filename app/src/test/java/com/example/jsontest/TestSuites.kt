package com.example.jsontest

import org.junit.runner.RunWith
import org.junit.runners.Suite

@RunWith(Suite::class)
@Suite.SuiteClasses(TestValidate::class,TestNumberValidate::class, TestArithmeticOperations::class)
class TestSuites