package com.app.condorlabssoccer.view.fragments

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.app.condorlabssoccer.databinding.FragmentWebBinding

class WebFragment : Fragment() {

    private var _binding: FragmentWebBinding? = null
    private val args: WebFragmentArgs by navArgs()
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentWebBinding.inflate(inflater, container, false)
        return binding.root
    }

    @SuppressLint("SetJavaScriptEnabled")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        (activity as AppCompatActivity?)!!.supportActionBar!!.hide()
        val myWebView: WebView = binding.wvFragmentWebPage
        binding.clLoadingFragmentDetails.visibility = View.VISIBLE
        myWebView.webViewClient = object : WebViewClient() {
            override fun onPageFinished(view: WebView?, url: String?) {
                super.onPageFinished(view, url)
                myWebView.visibility = View.VISIBLE
                binding.clLoadingFragmentDetails.visibility = View.GONE
            }
        }
        myWebView.settings.javaScriptEnabled = true
        val websiteUrl: String? = args.url
        if (websiteUrl != null) {
            binding.wvFragmentWebPage.loadUrl(websiteUrl)
        }
    }

}