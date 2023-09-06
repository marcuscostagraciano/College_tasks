from django.shortcuts import render
from django.views.generic import DetailView, ListView
from django.views.generic.edit import CreateView, UpdateView, DeleteView
from django.urls import reverse_lazy
from .models import Post

# Create your views here.
class BlogListView(ListView):
    model = Post
    template_name = 'home.htm'

class BlogDetailView(DetailView):
    model = Post
    template_name = 'post_detail.htm'

class BlogCreateView(CreateView):
    model = Post
    template_name = 'post_new.htm'
    fields = ['title', 'author', 'body']    

class BlogUpdateView(UpdateView):
    model = Post
    template_name = 'post_edit.htm'
    fields = ['title', 'body']
    
class BlogDeleteView(DeleteView):
    model = Post
    template_name = 'post_delete.htm'
    success_url = reverse_lazy('home')
