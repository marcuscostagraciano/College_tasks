from rest_framework import permissions

class IsAutorOrReadOnly(permissions.BasePermission):
    def has_object_permission(self, req, view, obj):
        # Read-only permissions are allowed for any request
        if req.method in permissions.SAFE_METHODS:
            return True
        
        # Write permissions are only allowed to the author of a post
        return obj.author == req.user
