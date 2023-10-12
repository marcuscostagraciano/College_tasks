from rest_framework import generics, permissions
from .models import Post
from .permissions import IsAutorOrReadOnly
from .serializers import PostSerializer


# Create your views here.
class PostList(generics.ListCreateAPIView):
    queryset = Post.objects.all()
    serializer_class = PostSerializer


class PostDetail(generics.RetrieveUpdateDestroyAPIView):
    permission_classes = (IsAutorOrReadOnly,)
    queryset = Post.objects.all()
    serializer_class = PostSerializer
